SUMMARY = "Asteroid's compass app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-compass.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/AsteroidOS/asteroid-compass.git;protocol=https;branch=master"
SRCREV = "b42ba9117c2f281fcbbb14e11f07e36f558e727f"
PV = "2.1+20+git"

require asteroid-app.inc

RDEPENDS:${PN} += "qtsensors qtsensors-qmlplugins qtsensors-plugins"
