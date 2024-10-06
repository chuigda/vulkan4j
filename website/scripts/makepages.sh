#!/usr/bin/env bash

cd tutorial/mdbook/en && mdbook build && cd ../../..

rm -rf pages
mkdir pages
mkdir pages/tutorial
mkdir pages/tutorial/en
cp -r tutorial/mdbook/en/book/* pages/tutorial/en/
cp -r tutorial/mdbook/images pages/
cp website/*.html pages/
