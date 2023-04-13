package com.despegar.automation.utils.enums;

public enum MenuOptions {
  FLIGHTS("Flights"),
  ONEWAY("One-way"),
  MULTICITY("Multi-city");


  private final String value;

  MenuOptions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
