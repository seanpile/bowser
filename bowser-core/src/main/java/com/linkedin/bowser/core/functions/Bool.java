package com.linkedin.bowser.core.functions;

import java.util.List;
import java.util.Map;

import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Objects;

public class Bool extends AbstractNQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.NQLFunction#getName()
   */
  @Override
  public String getName()
  {
    return "bool";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.NQLFunction#apply(java.util.Map, java.util.List)
   */
  @Override
  public NQLObject apply(Map<String, NQLObject> globals, List<NQLObject> arguments)
  {
    assertNumberOfArguments(arguments, 1);
    return Objects.create(getAsBoolean(arguments.get(0)));
  }
}