/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, { useState, useEffect } from "react";
import { WebView } from "react-native-webview";
import { StyleSheet, View, Dimensions } from "react-native";

var watsonxAssistant = require("./watsonxAssistant.html");

function BOTViewer({}): JSX.Element {
  return (
    <View style={styles.container}>
      <WebView
        originWhitelist={["*"]}
        javaScriptEnabled={true}
        domStorageEnabled={true}
        source={watsonxAssistant}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "flex-start",
    borderColor: "gray",
    borderTopWidth: 1,
    backgroundColor: "black",
  },
  pdf: {
    flex: 1,
    backgroundColor: "black",
  },
  sectionContainer: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 24,
    fontWeight: "600",
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: "400",
  },
  highlight: {
    fontWeight: "700",
  },

  item: {
    padding: 30,
    fontSize: 26,
    color: "black",
    textAlign: "center",
  },
  item1: {
    padding: 30,
    margin: 30,
    marginRight: 30,
    fontSize: 18,
    height: 500,
    width: "100%",
  },
});

export default BOTViewer;
