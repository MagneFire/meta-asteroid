SUMMARY = "Asteroid's heart rate monitor app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-hrm.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/AsteroidOS/asteroid-hrm.git;protocol=https;branch=master"
SRCREV = "994abab76ca5591140de9452a079e123af5fa03f"
PV = "2.1+10+git"

require asteroid-app.inc

DEPENDS += "qtsensors"
