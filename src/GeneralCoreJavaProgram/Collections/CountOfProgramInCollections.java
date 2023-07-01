package GeneralCoreJavaProgram.Collections;

import GeneralCoreJavaProgram.Collections.ListImpl.CountOfProgramsInList;
import GeneralCoreJavaProgram.Collections.Map.CountOfProgramsInMap;
import GeneralCoreJavaProgram.Collections.Queue.CountOfProgramsInQueue;
import GeneralCoreJavaProgram.Collections.SetImpl.CountOfFilesInSet;

import java.util.Arrays;

public class CountOfProgramInCollections {
    public static void main(String[] args) {
        System.out.println("Count of Program in Collections" + " " + returnFileCount());
    }

    public static int returnFileCount() {
        CountOfProgramsInQueue countOfProgramsInQueue = new CountOfProgramsInQueue();
        CountOfFilesInSet countOfFilesInSet = new CountOfFilesInSet();
        CountOfProgramsInMap countOfProgramsInMap = new CountOfProgramsInMap();
        CountOfProgramsInList countOfProgramsInList = new CountOfProgramsInList();
        int[] countOfFiles = {countOfFilesInSet.returnFileCount(), countOfProgramsInMap.returnFileCount(), countOfProgramsInQueue.returnFileCount(), countOfProgramsInList.returnFileCount()};
        return Arrays.stream(countOfFiles).sum();
    }
}
