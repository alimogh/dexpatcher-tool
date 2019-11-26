/*
 * DexPatcher - Copyright 2015-2019 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * DexPatcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.dexpatcher;

import java.util.List;

import lanchon.dexpatcher.mapper.NameDecoder;
import lanchon.dexpatcher.core.Context;
import lanchon.dexpatcher.core.logger.Logger;
import lanchon.multidexlib2.DexIO;

public class Configuration {

	public String sourceFile;
	public List<String> patchFiles;
	public String patchedFile;

	public int apiLevel;

	public boolean multiDex;
	public int multiDexJobs = 1;

	public int maxDexPoolSize = DexIO.DEFAULT_MAX_DEX_POOL_SIZE;

	public String annotationPackage = Context.DEFAULT_ANNOTATION_PACKAGE;
	public boolean constructorAutoIgnoreDisabled;

	public boolean decodeSource;
	public boolean decodePatches;
	public boolean decodeOutput;

	public String codeMarker = NameDecoder.DEFAULT_CODE_MARKER;
	public boolean treatDecodeErrorsAsWarnings;

	public Logger.Level logLevel = Context.DEFAULT_LOG_LEVEL;

	public String sourceCodeRoot;
	public boolean timingStats;

	public boolean dryRun;

}
