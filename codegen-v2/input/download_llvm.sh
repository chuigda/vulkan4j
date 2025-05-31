#!/usr/bin/env bash

prefix="https://raw.githubusercontent.com/llvm/llvm-project/refs/tags/llvmorg-20.1.6/llvm/include/llvm-c/"
files=(
  "Transforms/PassBuilder.h"
  "Analysis.h"
  "BitReader.h"
  "BitWriter.h"
  "Core.h"
  "DataTypes.h"
  "DebugInfo.h"
  "Disassembler.h"
  "DisassemblerTypes.h"
  "Error.h"
  "ErrorHandling.h"
  "ExecutionEngine.h"
  "IRReader.h"
  "Linker.h"
  "LLJIT.h"
  "LLJITUtils.h"
  "lto.h"
  "Object.h"
  "Orc.h"
  "OrcEE.h"
  "Remarks.h"
  "Support.h"
  "Target.h"
  "TargetMachine.h"
  "Types.h"
)

mkdir llvm
mkdir llvm/Transforms

for file in "${files[@]}"; do
  url="${prefix}${file}"
  download_location="./llvm/${file}"
  echo "Downloading ${url}..."
  curl -o "${download_location}" "${url}"
done
