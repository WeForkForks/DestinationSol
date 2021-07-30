/*
 * Copyright 2021 The Terasology Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.destinationsol.world.generators;

import org.destinationsol.Const;

/**
 * This class defines the general behavior for Sun generators. Any Sun will be
 * created from a concrete implementation of this class, with behavior specific to that Sun defined there.
 * TODO: Implement behavior common to all Suns as concrete methods in this class
 */
public abstract class SunGenerator extends FeatureGenerator {

    public static final float SUN_RADIUS = 2f * (Const.MAX_GROUND_HEIGHT + Const.ATM_HEIGHT);
}
