SUMMARY = "Asteroid's heart rate monitor app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-hrm.git"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

#SRC_URI = "git://github.com/AsteroidOS/asteroid-hrm.git;protocol=https"
SRC_URI = "git://github.com/PureTryOut/asteroid-hrm.git;branch=cmake;protocol=https"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"
inherit cmake_qt5

DEPENDS += "qml-asteroid qtsensors qttools-native qtdeclarative-native"
