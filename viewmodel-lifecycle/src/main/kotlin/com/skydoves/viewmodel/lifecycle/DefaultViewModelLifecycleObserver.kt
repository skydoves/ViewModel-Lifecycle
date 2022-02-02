/*
 * Copyright (C) 2022 skydoves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.viewmodel.lifecycle

/**
 * @author skydoves (Jaewoong Eum)
 *
 * A ViewModel lifecycle observer that implements default [onInitialized], [onCleared], [onStateChanged].
 */
public interface DefaultViewModelLifecycleObserver : FullViewModelLifecycleObserver {

  override fun onInitialized(viewModelLifecycleOwner: ViewModelLifecycleOwner) {
  }

  override fun onCleared(viewModelLifecycleOwner: ViewModelLifecycleOwner) {
  }

  override fun onStateChanged(viewModelState: ViewModelState) {
  }
}