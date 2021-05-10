SUMMARY = "QML components for AsteroidOS"
HOMEPAGE = "https://github.com/AsteroidOS/qml-asteroid.git"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=1702a92c723f09e3fab3583b165a8d90"

SRC_URI = "git://github.com/AsteroidOS/qml-asteroid.git;protocol=https"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

inherit native

do_install() {
    install -d ${D}/${bindir}
    install -m 755 ${S}/generate-desktop.sh ${D}/${bindir}/asteroid-generate-desktop
}
