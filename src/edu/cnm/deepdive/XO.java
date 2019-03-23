package edu.cnm.deepdive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XO {

  public static boolean getXO(String str) {

    str = str.toLowerCase();
    //    return str.replace("o","").length() == str.replace("x","").length();

    Pattern patternX = Pattern.compile("([xX])"); //case insensitive, use [x] for only lower
    Matcher matcherX = patternX.matcher(str);
    int countX = 0;
    while (matcherX.find()) {
      countX++;
    }

    Pattern patternO = Pattern.compile("([oO])"); //case insensitive, use [x] for only lower
    Matcher matcherO = patternO.matcher(str);
    int countO = 0;
    while (matcherO.find()) {
      countO++;
    }

    if (countX == countO) {
      return true;
    } else {
      return false;
    }
  }

}
