DESCRIPTION = "The core of a virtual keyboard for touch-screen based user interfaces"
HOMEPAGE = "https://wiki.maliit.org/Main_Page"

LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=5c917f6ce94ceb8d8d5e16e2fca5b9ad"

SRC_URI = "git://github.com/maliit/framework.git;branch=master;protocol=https"
SRCREV = "2.2.1"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

inherit pkgconfig cmake_qt5

EXTRA_OECMAKE += " -Denable-xcb=off"
EXTRA_OECMAKE += " -Denable-docs=OFF"
EXTRA_OECMAKE += " -Denable-dbus-activation=ON"
EXTRA_OECMAKE += " -Denable-glib=OFF"
EXTRA_OECMAKE += " -DQT5_PLUGINS_INSTALL_DIR=lib/plugins"
EXTRA_OECMAKE += " -DQT5_MKSPECS_INSTALL_DIR=lib/qt/mkspecs"
EXTRA_OECMAKE += " -DMALIIT_INSTALL_PRF=${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs/features"

EXTRA_OECMAKE += " -DLIBDIR=${OE_QMAKE_PATH_LIBS}"
EXTRA_OECMAKE += " -DDATADIR=${OE_QMAKE_PATH_DATA}"
EXTRA_OECMAKE += " -DMALIIT_PLUGINS_DATA_DIR=${datadir}"

DEPENDS += "qtdeclarative qtwayland qtwayland-native qttools-native qtbase-native"

FILES:${PN} += "\
    ${libdir}/plugins/ \
    ${bindir} \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS}/platforminputcontexts \
"

FILES:${PN}-dev += "\
    ${libdir}/qt/mkspecs/ \
    ${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs \
"
