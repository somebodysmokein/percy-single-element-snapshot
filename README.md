# Take Snapshot of Single Element in the DOM
Example project for Single Element Snapshot for Java


### Install the dependencies 

- To install Percy CLI, run the below command

    ```
    npm i @percy/cli
    ```

- Java Language Binding for Percy

    ```
    <dependency>
            <groupId>io.percy</groupId>
            <artifactId>percy-java-selenium</artifactId>
            <version>1.1.0</version>
    </dependency>
    ```

[Note: All the Dependencies are included in the sample script]


## Steps to take a snapshot of the element

- Navigate to the page where the element is located
- Identify the CSS locator for the element 
- Add the CSS selector to the "Scope" parameter(last parameter in the snapshot method) of the percy snapshot method. Scope parameter accepts String types. 

### **Usage :**

```
    percy.snapshot("Single DOM Element",Arrays.asList(new Integer[]{375, 480, 720, 1280, 1440, 1920}),
                null,false,null,"#signupModalButton");
```

In the above example `#signupModalButton` is the CSS selector of a button in the Home Page https://www.browserstack.com

### To run the sample please follow the below steps

 - Create a project in Percy and get the PERCY_TOKEN
 - Set the environment variables  by running the following command

     ```
        export PERCY_TOKEN=<Unique Token> && export BASE_URL=https://www.browserstack.com
     ```
     
 - Run `npm install` to install all the dependencies

 - Trigger the Percy build by running the following command

    ```
        npm run test
    ```    