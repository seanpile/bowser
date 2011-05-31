/*
 * Copyright 2010-2011 LinkedIn Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 * 
 */
public interface Sequence extends Subscriptable, Collection
{
  /**
   * @param start
   * @param end
   * @return an NQLObject (sub-sequence) containing only the elements from start to end
   */
  public NQLObject range(int start, int end);
}