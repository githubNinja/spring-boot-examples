/*package com.spring.bootexamples.component;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;*/

//public class GetItem {

  /*  public void getItemMethod(String tableName, String key, String keyVal) {
        System.out.format("Retrieving item \"%s\" from \"%s\"\n", keyVal, tableName);

        Region region = Region.US_WEST_2;
        DynamoDbClient ddb = DynamoDbClient.builder()
                .region(region)
                .build();

        getDynamoDBItem(ddb, tableName, key, keyVal);
        ddb.close();
    }*/
//}

/*
public class GetItem {
    public void getItemMethod() {


        String tableName = args[0];
        String key = args[1];
        String keyVal = args[2];

        System.out.format("Retrieving item \"%s\" from \"%s\"\n", keyVal, tableName);

        Region region = Region.US_WEST_2;
        DynamoDbClient ddb = DynamoDbClient.builder()
                .region(region)
                .build();

        getDynamoDBItem(ddb, tableName, key, keyVal);
        ddb.close();
    }

    // snippet-start:[dynamodb.java2.get_item.main]
    public  void getDynamoDBItem(DynamoDbClient ddb, String tableName, String key,
                                       String keyVal) {

        HashMap<String, AttributeValue> keyToGet = new HashMap<String, AttributeValue>();

        keyToGet.put(key, AttributeValue.builder()
                .s(keyVal).build());

        GetItemRequest request = GetItemRequest.builder()
                .key(keyToGet)
                .tableName(tableName)
                .build();

        try {
            Map<String, AttributeValue> returnedItem = ddb.getItem(request).item();

            if (returnedItem != null) {
                Set<String> keys = returnedItem.keySet();
                System.out.println("Amazon DynamoDB table attributes: \n");

                for (String key1 : keys) {
                    System.out.format("%s: %s\n", key1, returnedItem.get(key1).toString());
                }
            } else {
                System.out.format("No item found with the key %s!\n", key);
            }
        } catch (DynamoDbException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
    // snippet-end:[dynamodb.java2.get_item.main]
}
*/
