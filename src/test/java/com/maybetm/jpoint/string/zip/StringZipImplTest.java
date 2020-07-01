package com.maybetm.jpoint.string.zip;

import com.maybetm.jpoint.string.zip.common.StringZip;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zebzeev-sv
 * @version 02.07.2020 0:19
 */
public class StringZipImplTest
{

  private final static String source1 = "AAAAA";
  private final static String source2 = "AAAAABBBC";
  private final static String source3 = "";
  private final static String source4 = null;
  private final static String source5 = "ABC";
  private final static String source6 = "ABBBBBC";

  private final static StringZip stringZip = new StringZipImpl();

  @Test
  public void zipSource1()
  {
    Assert.assertEquals(stringZip.zip(source1), "5A");
  }

  @Test
  public void zipSource2()
  {
    Assert.assertEquals(stringZip.zip(source2), "5A3BC");
  }

  @Test
  public void zipSource3()
  {
    Assert.assertEquals(stringZip.zip(source3), "");
  }

  @Test
  public void zipSource4()
  {
    assertNull(stringZip.zip(source4));
  }

  @Test
  public void zipSource5()
  {
    Assert.assertEquals(stringZip.zip(source5), "ABC");
  }

  @Test
  public void zipSource6()
  {
    Assert.assertEquals(stringZip.zip(source6), "ABBBBBC");
  }
}
