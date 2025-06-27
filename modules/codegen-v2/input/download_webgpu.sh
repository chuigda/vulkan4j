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

echo Downloading WebGPU webgpu.yml
WEBGPU_VERSION="bac520839ff5ed2e2b648ed540bd9ec45edbccbc"
curl -o webgpu.yml https://raw.githubusercontent.com/webgpu-native/webgpu-headers/$WEBGPU_VERSION/webgpu.yml
