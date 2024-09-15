SUMMARY = "Asteroid's BLE synchronization daemon."
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-btsyncd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/AsteroidOS/asteroid-btsyncd.git;protocol=https;branch=master \
    file://asteroid-btsyncd.service"
SRCREV = "dcf9801ccaf220bb1e24dff2a51ef3778a4fb26b"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"
inherit cmake_qt5 gsettings pkgconfig

UPSTREAM_CHECK_COMMITS = "1"

DEPENDS += "qml-asteroid qtbase glibmm qtmpris timed qttools-native nemo-qml-plugin-systemsettings"
RDEPENDS:${PN} += "glibmm qtmpris"

FILES:${PN} += "/usr/bin/ /usr/lib/systemd/user/ /usr/share/glib-2.0/schemas /usr/share/translations/ /usr/lib/systemd/user/default.target.wants/"

do_install:append() {
    install -d ${D}/usr/lib/systemd/user/
    install -d ${D}/usr/lib/systemd/user/default.target.wants/
    cp ../asteroid-btsyncd.service ${D}/usr/lib/systemd/user/
    if [ ! -f ${D}/usr/lib/systemd/user/default.target.wants/asteroid-btsyncd.service ]; then
        ln -s /usr/lib/systemd/user/asteroid-btsyncd.service ${D}/usr/lib/systemd/user/default.target.wants/asteroid-btsyncd.service
    fi
}

