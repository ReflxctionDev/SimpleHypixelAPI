/*
 * * Copyright 2018-2019 github.com/ReflxctionDev
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
package io.github.reflxction.hypixelapi.core.implementation.player;

import io.github.reflxction.hypixelapi.player.HypixelQuest;

import java.util.Date;
import java.util.List;

/**
 * Class implementation for {@link HypixelQuest}
 */
public class HypixelQuestImpl implements HypixelQuest {

    private List<Date> completions;

    /**
     * Returns the date of every completion time for this quest
     *
     * @return The date of every completion time for this quest
     */
    @Override
    public List<Date> getCompletions() {
        return completions;
    }

    @Override
    public String toString() {
        return "HypixelQuestImpl{" +
                "completions=" + completions +
                '}';
    }
}
