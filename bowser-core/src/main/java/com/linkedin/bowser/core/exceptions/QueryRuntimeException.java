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

package com.linkedin.bowser.core.exceptions;

import org.apache.commons.lang.ObjectUtils;

public class QueryRuntimeException extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  private final int         _line;
  private final int         _charPositionInLine;
  private final String      _text;

  public QueryRuntimeException(QueryRuntimeException e)
  {
    super(e.getMessage());
    _line = e.getLine();
    _charPositionInLine = e.getCharPositionInLine();
    _text = e.getText();
  }

  public QueryRuntimeException(String errorType,
                               int line,
                               int charPositionInLine,
                               String text,
                               String message)
  {
    super(String.format("%s: line %d, pos %d: %s",
                        errorType,
                        line,
                        charPositionInLine,
                        ObjectUtils.toString(message, "").trim()));

    _line = line;
    _charPositionInLine = charPositionInLine;
    _text = text;
  }

  /**
   * @return
   */
  public int getLine()
  {
    return _line;
  }

  /**
   * @return
   */
  public int getCharPositionInLine()
  {
    return _charPositionInLine;
  }

  /**
   * @return
   */
  public String getText()
  {
    return _text;
  }
}
