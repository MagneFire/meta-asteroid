DESCRIPTION = "A virtual keyboard for touch-screen based user interfaces"
HOMEPAGE = "https://wiki.maliit.org/Main_Page"


LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LGPL;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/maliit/keyboard.git;branch=master;protocol=https \
    file://0001-Disable-Chewing-and-Pinyin.patch"
SRCREV = "2.2.1.1"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

inherit pkgconfig cmake_qt5

EXTRA_OECMAKE += " -Denable-presage=OFF"
EXTRA_OECMAKE += " -Denable-hunspell=OFF"
EXTRA_OECMAKE += " -Denable-tests=OFF"

EXTRA_OECMAKE += " -DQT5_PLUGINS_INSTALL_DIR=lib/qt/plugins"
EXTRA_OECMAKE += " -DQT5_MKSPECS_INSTALL_DIR=lib/qt/mkspecs"

EXTRA_OECMAKE += " -DLIBDIR=${OE_QMAKE_PATH_LIBS}"
EXTRA_OECMAKE += " -DDATADIR=${OE_QMAKE_PATH_DATA}"
EXTRA_OECMAKE += " -DMALIIT_PLUGINS_DATA_DIR=${datadir}"

DEPENDS += "qtdeclarative qtwayland qtwayland-native qttools-native qtbase-native maliit-framework qtmultimedia qtfeedback"

FILES:${PN} += "\
    ${libdir}/qt5/plugins/ \
    ${libdir}/qt/plugins/ \
    ${bindir} \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS}/platforminputcontexts \
"

FILES:${PN}-dev += "\
    ${libdir}/qt5/mkspecs/ \
    ${libdir}/qt/mkspecs/ \
    ${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs \
"

FILES:${PN} += "\
    ${libdir}/maliit \
    ${datadir} \
"