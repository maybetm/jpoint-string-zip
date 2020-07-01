package com.maybetm.jpoint.string.zip;

import com.maybetm.jpoint.string.zip.common.StringZip;

/**
 * @author zebzeev-sv
 * @version 02.07.2020 0:18
 */
public class StringZipImpl implements StringZip
{

  @Override
  public String zip(String source)
  {
    if (source == null)
      return null;

    return zip(new StringBuilder(), source).toString();
  }

  private StringBuilder zip(StringBuilder builder, String source)
  {
    if (source.isEmpty())
      return builder.append(source);

    char[] sourceChars = source.toCharArray();
    int lastRepeated = lastRepeated(sourceChars);

    if (lastRepeated == -1)
      return builder.append(source);
    else {
      source = source.substring(++lastRepeated);
      builder.append(lastRepeated).append(sourceChars[0]);
      zip(builder, source);
    }

    return builder;
  }

  private int lastRepeated(char[] source)
  {
    int lastIndex = -1;
    char pre = source[0];
    for (int i = 1; i < source.length; i++) {
      if (pre == source[i])
        lastIndex = i;
    }
    return lastIndex;
  }
}
