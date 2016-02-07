SUMMARY = "Asteroid's stopwatch app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-stopwatch.git"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/AsteroidOS/asteroid-stopwatch.git;protocol=https"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCREV}"
S = "${WORKDIR}/git"
inherit qmake5

DEPENDS += "qml-asteroid qtsvg mapplauncherd-booster-qtcomponents"
