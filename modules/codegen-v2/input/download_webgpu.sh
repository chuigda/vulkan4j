#!/usr/bin/env bash

# WebGPU-Native is a still quickly evolving project, and there are known breaking changes in
# the WebGPU API, including those which will completely break FFI bindings. As a workaround, we are
# providing binding based on a specific version of the WebGPU-Native API.
#
# This version is used by WGPU-RS v25.0.2.1.
# https://github.com/gfx-rs/wgpu-native/tree/v25.0.2.1/ffi
#
# Dawn is unfortunately not supported yet, because the WebGPU-Native API version used by Dawn is
# not very transparent to us, so we cannot pin it to a specific version.

WEBGPU_VERSION="bac520839ff5ed2e2b648ed540bd9ec45edbccbc"
WGPU_RS_VERSION="refs/tags/v25.0.2.1"

echo Downloading WebGPU webgpu.yml
curl -o webgpu.yml https://raw.githubusercontent.com/webgpu-native/webgpu-headers/$WEBGPU_VERSION/webgpu.yml

# Y2JCONV is a utility converting YML to JSON, for the sake of my sanity.
# You can build it by running `cd /path/to/vulkan4j/misc/y2jconv` and `cargo install`
echo Converting webgpu.yml to webgpu.json
y2jconv webgpu.yml > webgpu.json

# Let's also downlad the header file for referential use
echo Downloading WebGPU webgpu.h for reference
curl -o webgpu.h https://raw.githubusercontent.com/webgpu-native/webgpu-headers/$WEBGPU_VERSION/webgpu.h

echo Downloading WGPU-RS ffi header files
curl -o wgpu.h https://raw.githubusercontent.com/gfx-rs/wgpu-native/$WGPU_RS_VERSION/ffi/wgpu.h
