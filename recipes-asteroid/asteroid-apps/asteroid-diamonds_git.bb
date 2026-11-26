SUMMARY = "A 2048 like game for AsteroidOS"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-diamonds.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/AsteroidOS/asteroid-diamonds.git;protocol=https;branch=master"
SRCREV = "4e47a6c89b7158f4a0b1c8664aea21d182a08d00"
PV = "2.1+11+git"

require asteroid-app.inc

FILES:${PN} += "/usr/share/icons/asteroid/"
