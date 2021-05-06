SUMMARY = "QML components for AsteroidOS"
HOMEPAGE = "https://github.com/AsteroidOS/qml-asteroid.git"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=1702a92c723f09e3fab3583b165a8d90"

SRC_URI = "git://github.com/PureTryOut/qml-asteroid.git;branch=cmake;protocol=https \
        file://0001-WIP.patch"
#SRC_URI = "git://github.com/AsteroidOS/qml-asteroid.git;protocol=https"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

#DEPENDS += "extra-cmake-modules asteroid-machine-config qtdeclarative qtsvg qtvirtualkeyboard mlite mapplauncherd-booster-qtcomponents qtdeclarative-native"
#RDEPENDS_${PN} += "asteroid-machine-config qtsvg-plugins qtvirtualkeyboard asteroid-icons-ion"

#FILES_${PN} += "/usr/lib /usr/share/icons/asteroid/"
#FILES_${PN}-dbg += "/usr/lib/qml/org/asteroid/controls/.debug/ /usr/lib/qml/QtQuick/Controls/Styles/Asteroid/.debug/"
#FILES_${PN}-dev += "/usr/lib/mkspecs/ /usr/share/asteroidapp/cmake/ /usr/bin/generate-desktop"

#BBCLASSEXTEND = "native nativesdk"
inherit native

#FILES_${PN} = "${D}${prefix}/* ${D}${bindir}/*"

do_install() {
    # This app only uses translations for the desktop shortcut.
    
    #install -d ${D}/usr/bin/
    #cp generate-desktop.sh ${D}/usr/bin/generate-desktop

    install -d ${D}/${bindir}
    install -m 755 ${S}/generate-desktop.sh ${D}/${bindir}/asteroid-generate-desktop
}