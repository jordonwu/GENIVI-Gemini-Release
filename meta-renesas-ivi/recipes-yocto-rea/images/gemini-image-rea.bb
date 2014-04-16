# Base this image on generic IVI image
include recipes-yocto-ivi/images/ivi-image.inc

PV = "5.0.0"
#PR = "r1"

IMAGE_INSTALL_append = " \
    packagegroup-abstract-component-p1 \
    packagegroup-placeholder-component-p1 \
    packagegroup-specific-component-p2 \
    packagegroup-abstract-component-p2 \
    packagegroup-specific-component-p1 \
	packagegroup-rea \
	gst-ffmpeg \
	gst-plugins-ugly \
	gst-plugins-base \
	gst-plugins-good \
	packagegroup-specific-components \
"

# Add image specific packages
