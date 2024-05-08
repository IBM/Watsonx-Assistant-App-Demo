# Watsonx-Assistant-App-Demo
Watsonx-Assistant-App-Demo is a guide to Generative AI on Mobile device – Using watsonx, Rag Pattern, and Watson Discovery on the Samsung Galaxy Z Fold 5.

Generative AI has changed the view for not only for enterprises but also regular users on how real AI can be used in their daily lives, as well as businesses. IBM has been the frontier of AI technology for both hardware and software, and recently announced watsonx – IBM’s Enterprise Generative AI Platform.
 
The world of mobile technology is constantly evolving, and Samsung is at the forefront of innovation with its Fold series of smartphones. There are countless benefits that folding phone with dual screens can bring the value to the users, and it’s entertaining to try some of the basic key folding functions as developers.
 
We want to combine these two cutting edge technologies to demonstrate how you can also bring your own ideas to showcase the power of AI and mobile technologies.
 
In this guide, we'll explore key IBM technologies such as watsonx.ai, watsonx Assistant, Watson Discovery and Samsung Galaxy SDK(Details : https://www.samsung.com/in/smartphones/galaxy-fold/) to show a simple RAG Pattern demo.

We created this simple mobile application for IBM’s TechXchange conference. It took only few days to code.
 
The app mainly focus on the chatbot using generative AI to answer questions about the TechXchange event. The focus of this guide will be on this chatbot, where combination of watsonx AI technology integrated with RAG pattern to this mobile application to create powerful conversational AI systems that enhanced information retrieval capabilities and customer interactions.

# Prerequisites
- An IBM Cloud account
- Samsung Galaxy Fold series device(recommended) or any Android device.


# IBM’s Generative AI platform and AI powered software
**Watsonx.ai**
IBM watsonx.ai is an IBM’s Enterprise generative AI serving platform. It integrates multiple LLMs from Open Community as well as IBM’s own LLMs, providing APIs and SDKs to integrate them into applications.
Multiple large language models are made available by companies and open source community every day. It is critical for enterprises to understand and validate which ones would be good for their business applications, and watsonx.ai provides ‘Prompt Lab’ feature to experiment with different LLMs to validate use cases with prompt engineering. It also comes with convenient APIs and SDKs that quickly integrates into applications once LLM has been validated. Watsonx.ai uses optimized versions of many open-source serving technologies to enable enterprises get most value of each request servings. Especially with IBM’s own ‘Granite’ LLMs, IBM indemnifies the use of Granite LLMs, where many enterprise clients lean towards IBM models compared open community LLMs.

**Watsonx Assistant** 
watsonx Assistant is IBM’s Enterprise Conversational AI platform. It has a simple and easy dialog-flow composing interface that even non-programmers can quickly create a chatbot and deploy ‘skills’ to understand and respond to user queries in natural language.
 
It can also support complex conversational AI features to create chatbots that can connect to sophiscated back-end systems and handle data processing to answer business user’s questions. One of the key areas of this use case is customer support chat-ops.

**Watson Discovery**
Watson Discovery is IBM’s Document Understanding and Search platform. It provides the ability to understanding the document structure, searching these documents using natural language. It provides multiple ways to integrate with your enterprise applications to enhance business operations using documents.

**Gen AI & RAG patterns**
ChatGPT struck the world how many things can be possible to ask questions and retrieve/generate answers with Large Language Models(LLMs). It gives users experience having a ‘human-like’ conversations, distinguishing from predefined answers by regular chatbot. Some of the limitation LLMs have is it’s tendency to produce hallucinations.  Developers and data scientists want to limit the hallucinations, and  to provide more relevant, natural language answer, RAG(Retrieval Augmented Generation) has been introduced. It is a technic to search for most relevant answer from up-to-date documents and present it in natural language with LLM generated answers.  
 
This is a new [**React Native**](https://reactnative.dev) project, bootstrapped using [`@react-native-community/cli`](https://github.com/react-native-community/cli).

# Getting Started

>**Note**: Make sure you have completed the [React Native - Environment Setup](https://reactnative.dev/docs/environment-setup) instructions till "Creating a new application" step, before proceeding.

## Step 1: Start the Metro Server

First, you will need to start **Metro**, the JavaScript _bundler_ that ships _with_ React Native.

To start Metro, run the following command from the _root_ of your React Native project:

```bash
# using npm
npm start

# OR using Yarn
yarn start
```

## Step 2: Start your Application

Let Metro Bundler run in its _own_ terminal. Open a _new_ terminal from the _root_ of your React Native project. Run the following command to start your _Android_ or _iOS_ app:

### For Android

```bash
# using npm
npm run android

# OR using Yarn
yarn android
```

### For iOS

```bash
# using npm
npm run ios

# OR using Yarn
yarn ios
```

If everything is set up _correctly_, you should see your new app running in your _Android Emulator_ or _iOS Simulator_ shortly provided you have set up your emulator/simulator correctly.

This is one way to run your app — you can also run it directly from within Android Studio and Xcode respectively.

## Step 3: Modifying your App

Now that you have successfully run the app, let's modify it.

1. Open `App.tsx` in your text editor of choice and edit some lines.
2. For **Android**: Press the <kbd>R</kbd> key twice or select **"Reload"** from the **Developer Menu** (<kbd>Ctrl</kbd> + <kbd>M</kbd> (on Window and Linux) or <kbd>Cmd ⌘</kbd> + <kbd>M</kbd> (on macOS)) to see your changes!

   For **iOS**: Hit <kbd>Cmd ⌘</kbd> + <kbd>R</kbd> in your iOS Simulator to reload the app and see your changes!

## Congratulations! :tada:

You've successfully run and modified your React Native App. :partying_face:

### Now what?

- If you want to add this new React Native code to an existing application, check out the [Integration guide](https://reactnative.dev/docs/integration-with-existing-apps).
- If you're curious to learn more about React Native, check out the [Introduction to React Native](https://reactnative.dev/docs/getting-started).

# Troubleshooting

If you can't get this to work, see the [Troubleshooting](https://reactnative.dev/docs/troubleshooting) page.

# Conclusion
 
The fusion of watsonx Assistant, watsonx.ai, the RAG pattern, and Watson Discovery on the Samsung Galaxy Z Fold marks a significant leap forward in mobile AI capabilities.
 
This convergence not only enriches user experiences but also empowers businesses and individuals with unprecedented access to intelligence and insights. Join us embracing this transformative technology and embrace the future of mobile AI.
 
If you have great ideas, look for applying IBM Call for Code challenge with your own Generative AI on Samsung Galaxy Z Fold.

# Learn More
To learn more about IBM watsonx.ai and watsonx Assistant , please visit the following resources:
- IBM watsonx Assistant(https://www.ibm.com/products/watsonx-assistant)
- IBM Watson Discovery (https://www.ibm.com/products/watson-discovery)
- RAG Pattern(https://www.ibm.com/docs/en/watsonx/saas?topic=models-retrieval-augmented-generation)
 
To learn more about React Native, take a look at the following resources:

- [React Native Website](https://reactnative.dev) - learn more about React Native.
- [Getting Started](https://reactnative.dev/docs/environment-setup) - an **overview** of React Native and how setup your environment.
- [Learn the Basics](https://reactnative.dev/docs/getting-started) - a **guided tour** of the React Native **basics**.
- [Blog](https://reactnative.dev/blog) - read the latest official React Native **Blog** posts.
- [`@facebook/react-native`](https://github.com/facebook/react-native) - the Open Source; GitHub **repository** for React Native.
