
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

include linux-fslc.inc
require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

# Put a local version until we have a true SRCREV to point to
SRC_URI = "git://github.com/engicam-stable/engicam-linux-fslc.git;protocol=git;branch=smarc \
           file://defconfig"

SRCREV = "d0231da1a2362674009e1aee5b90bb7497faa8f9"

S = "${WORKDIR}/git"

# We need to pass it as param since kernel might support more then one
# machine, with different entry points

KERNEL_EXTRA_ARGS_mx6sx += "LOADADDR=0x80008000"

LINUX_VERSION_EXTENSION="-engicam"

COMPATIBLE_MACHINE = "(mx6sx)"