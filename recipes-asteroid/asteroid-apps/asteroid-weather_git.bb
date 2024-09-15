SUMMARY = "Asteroid's weather app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-weather.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/AsteroidOS/asteroid-weather.git;protocol=https;branch=master"
SRCREV = "2d250e4d395d8ee397438ee90eaaab45a4116158"

require asteroid-app.inc

DEPENDS += "nemo-qml-plugin-configuration"
RDEPENDS:${PN} += "nemo-qml-plugin-configuration"
