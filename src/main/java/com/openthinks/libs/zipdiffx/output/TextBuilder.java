/*
 * zipdiff is available under the terms of the Apache License, version 2.0
 *
 * Link: http://www.apache.org/licenses/
 */
package com.openthinks.libs.zipdiffx.output;

import java.io.OutputStream;
import java.io.PrintWriter;

import com.openthinks.libs.zipdiffx.Differences;

/**
 * creates a list of differences.
 *
 * @author Sean C. Sullivan
 */
public class TextBuilder extends AbstractBuilder {

  /**
   * builds the output
   *
   * @param out OutputStream to write to
   * @param d differences
   */
  @Override
  public void build(OutputStream out, Differences d) {
    PrintWriter pw = new PrintWriter(out);
    pw.println(d.toString());
    pw.flush();
  }
}
