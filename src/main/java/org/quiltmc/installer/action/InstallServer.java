/*
 * Copyright 2021 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.installer.action;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;

/**
 * An action which creates the server launch jar and downloads the dedicated server.
 */
public final class InstallServer extends Action<InstallServer.MessageType> {
	private final String minecraftVersion;
	@Nullable
	private final String loaderVersion;
	@Nullable
	private final String serverDir;

	InstallServer(String minecraftVersion, @Nullable String loaderVersion, @Nullable String serverDir) {
		this.minecraftVersion = minecraftVersion;
		this.loaderVersion = loaderVersion;
		this.serverDir = serverDir;
	}

	@Override
	public void run(Executor displayExecutor, Consumer<MessageType> statusTracker) {
		// TODO
	}

	public enum MessageType {
	}
}