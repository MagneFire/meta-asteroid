SUMMARY = "Asteroid's alarm clock app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-alarmclock.git"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

#SRC_URI = "git://github.com/AsteroidOS/asteroid-alarmclock.git;protocol=https"
SRC_URI = "git://github.com/PureTryOut/asteroid-alarmclock.git;branch=cmake;protocol=https"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"
inherit cmake_qt5

DEPENDS += "qml-asteroid nemo-qml-plugin-alarms qttools-native qtdeclarative-native"

RDEPENDS_${PN} += "nemo-qml-plugin-alarms"
FILES_${PN} += "/usr/share/translations/ /usr/lib/systemd/user/alarmpresenter.service /usr/share/dbus-1/services/com.nokia.voland.service"
