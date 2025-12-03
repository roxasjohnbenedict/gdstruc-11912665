package com.gdstruc.module5;

public class SimpleHashtable {

    private StoredPlayer[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }

    public void put(String key, Player value) {

        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {

            int stopIndex = hashedKey;
            hashedKey = (hashedKey + 1) % hashtable.length;

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("No space available for key " + key);
        } else {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].value;
    }

    // Finds an index using linear probing
    private int findKey(String key) {

        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null
                && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        hashedKey = (hashedKey + 1) % hashtable.length;

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {

            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        return -1;
    }

    public void remove(String key) {

        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            System.out.println("Key " + key + " not found.");
            return;
        }

        System.out.println("Removing: " + key);
        hashtable[hashedKey] = null;

        // Rehash the entire cluster to the right
        int index = (hashedKey + 1) % hashtable.length;

        while (hashtable[index] != null) {
            StoredPlayer temp = hashtable[index];
            hashtable[index] = null;  // remove it temporarily
            put(temp.key, temp.value);  // reinsert
            index = (index + 1) % hashtable.length;
        }
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println("Index " + i + ": " + hashtable[i]);
        }
    }
}

