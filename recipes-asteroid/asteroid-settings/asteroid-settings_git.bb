SUMMARY = "Asteroid's system settings app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-settings.git"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

#SRC_URI = "git://github.com/AsteroidOS/asteroid-settings.git;protocol=https"
SRC_URI = "git://github.com/PureTryOut/asteroid-settings.git;branch=cmake;protocol=https"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"
inherit cmake_qt5

DEPENDS += "qml-asteroid qml-asteroid-native nemo-qml-plugin-systemsettings nemo-qml-plugin-dbus qttools-native qtdeclarative-native"
RDEPENDS_${PN} += "nemo-qml-plugin-systemsettings nemo-qml-plugin-dbus qtmultimedia-qmlplugins libconnman-qt5-qmlplugins"
FILES_${PN} += "/usr/share/translations/"
