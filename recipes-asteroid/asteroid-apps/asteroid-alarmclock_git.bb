SUMMARY = "Asteroid's alarm clock app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-alarmclock.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/AsteroidOS/asteroid-alarmclock.git;protocol=https;branch=master"
SRCREV = "08fd73856a39ab1f5fcd61ffdff1d2d89ab4543e"

require asteroid-app.inc

inherit pkgconfig

DEPENDS += "nemo-qml-plugin-alarms"
RDEPENDS:${PN} += "nemo-qml-plugin-alarms"
FILES:${PN} += "${libdir}/asteroid-alarmpresenter.so ${libdir}/systemd/user/alarmpresenter.service /usr/share/dbus-1/services/com.nokia.voland.service"
