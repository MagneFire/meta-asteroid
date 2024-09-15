SUMMARY = "Desktop file generation for AsteroidOS apps"
HOMEPAGE = "https://github.com/AsteroidOS/qml-asteroid.git"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=1702a92c723f09e3fab3583b165a8d90"

SRC_URI = "git://github.com/AsteroidOS/qml-asteroid.git;protocol=https;branch=master"
SRCREV = "f3e3fb0cc9a072c74ecd1c69b0968142580f27f6"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

UPSTREAM_CHECK_COMMITS = "1"

inherit native

do_install() {
    install -d ${D}/${bindir}
    install -m 755 ${S}/generate-desktop.sh ${D}/${bindir}/asteroid-generate-desktop
}
