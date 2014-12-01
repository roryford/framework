/*  Copyright 2014 White Label Personal Clouds Pty Ltd
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */
package me.welcomer.rulesets.welcomerId

import me.welcomer.framework.pico.EventedEvent
import me.welcomer.framework.pico.PicoRuleset
import me.welcomer.framework.pico.service.PicoServicesComponent

class WelcomerIdRuleset(picoServices: PicoServicesComponent#PicoServices) extends PicoRuleset(picoServices) {
  import context._

  subscribeToEvents("TEST", "HELLO")

  def selectWhen = {
    case EventedEvent("TEST", "HELLO", _, _, _) => log.info("TEST:HELLO EventedEvent Received")
  }

}