# Take Snapshot of Single Element in the DOM
Example project for Single Element Snapshot for Java


### Install the dependencies

To install the dependencies, run :

- Percy CLI

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



## Steps to take a snapshot of the element

Navigate to the page where the element is located
Identify the CSS locator for the element 
Use the CSS script on the percy snapshot command witht he "Scope" parameter. Scope parameter is a String type. 

### **Usage :**

	```
		percy.snapshot("Single DOM Element",Arrays.asList(new Integer[]{375, 480, 720, 1280, 1440, 1920}),
                null,false,null,"#signupModalButton");
	```	