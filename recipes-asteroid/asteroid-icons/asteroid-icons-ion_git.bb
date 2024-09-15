SUMMARY = "Asteroid's default set of icons, based on Ion Icons"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-icons-ion"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92e02b7236a0635eaf1478f8041b0602"

SRC_URI = "git://github.com/AsteroidOS/asteroid-icons-ion;protocol=https;branch=master"
SRCREV = "a80370f23a6485a20252d0fd2c30b0919e2c39e4"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

UPSTREAM_CHECK_COMMITS = "1"

do_install() {
    install -d ${D}/usr/share/icons/asteroid/
    cp ${S}/src/* ${D}/usr/share/icons/asteroid/
}

FILES:${PN} = "/usr/share/icons/asteroid/"
