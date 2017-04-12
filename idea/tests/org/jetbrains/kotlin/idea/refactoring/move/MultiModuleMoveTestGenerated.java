/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.move;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/refactoring/moveMultiModule")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiModuleMoveTestGenerated extends AbstractMultiModuleMoveTest {
    public void testAllFilesPresentInMoveMultiModule() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/moveMultiModule"), Pattern.compile("^(.+)\\.test$"), TargetBackend.ANY);
    }

    @TestMetadata("moveDirectoryKeepPackageDirective/moveDirectoryKeepPackageDirective.test")
    public void testMoveDirectoryKeepPackageDirective_MoveDirectoryKeepPackageDirective() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveDirectoryKeepPackageDirective/moveDirectoryKeepPackageDirective.test");
        doTest(fileName);
    }

    @TestMetadata("moveDirectoryToUnrelatedModuleConflict/moveDirectoryToUnrelatedModuleConflict.test")
    public void testMoveDirectoryToUnrelatedModuleConflict_MoveDirectoryToUnrelatedModuleConflict() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveDirectoryToUnrelatedModuleConflict/moveDirectoryToUnrelatedModuleConflict.test");
        doTest(fileName);
    }

    @TestMetadata("moveFileToNonSrc/moveFileToNonSrc.test")
    public void testMoveFileToNonSrc_MoveFileToNonSrc() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveFileToNonSrc/moveFileToNonSrc.test");
        doTest(fileName);
    }

    @TestMetadata("moveFileWithDeclarationsToUnrelatedModuleConflict/moveFileWithDeclarationsToUnrelatedModuleConflict.test")
    public void testMoveFileWithDeclarationsToUnrelatedModuleConflict_MoveFileWithDeclarationsToUnrelatedModuleConflict() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveFileWithDeclarationsToUnrelatedModuleConflict/moveFileWithDeclarationsToUnrelatedModuleConflict.test");
        doTest(fileName);
    }

    @TestMetadata("moveFromJsModuleToJvmModule/moveFromJsModuleToJvmModule.test")
    public void testMoveFromJsModuleToJvmModule_MoveFromJsModuleToJvmModule() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveFromJsModuleToJvmModule/moveFromJsModuleToJvmModule.test");
        doTest(fileName);
    }

    @TestMetadata("moveFromJvmModuleToJsModule/moveFromJvmModuleToJsModule.test")
    public void testMoveFromJvmModuleToJsModule_MoveFromJvmModuleToJsModule() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveFromJvmModuleToJsModule/moveFromJvmModuleToJsModule.test");
        doTest(fileName);
    }

    @TestMetadata("moveInternalToAnotherModule/moveInternalToAnotherModule.test")
    public void testMoveInternalToAnotherModule_MoveInternalToAnotherModule() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveInternalToAnotherModule/moveInternalToAnotherModule.test");
        doTest(fileName);
    }

    @TestMetadata("moveMultipleFilesToUnrelatedModuleConflict/moveMultipleFilesToUnrelatedModuleConflict.test")
    public void testMoveMultipleFilesToUnrelatedModuleConflict_MoveMultipleFilesToUnrelatedModuleConflict() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveMultipleFilesToUnrelatedModuleConflict/moveMultipleFilesToUnrelatedModuleConflict.test");
        doTest(fileName);
    }

    @TestMetadata("moveToModuleWithoutLibConflict/moveToModuleWithoutLibConflict.test")
    public void testMoveToModuleWithoutLibConflict_MoveToModuleWithoutLibConflict() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveToModuleWithoutLibConflict/moveToModuleWithoutLibConflict.test");
        doTest(fileName);
    }

    @TestMetadata("moveToUnrelatedModuleConflict/moveToUnrelatedModuleConflict.test")
    public void testMoveToUnrelatedModuleConflict_MoveToUnrelatedModuleConflict() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/moveToUnrelatedModuleConflict/moveToUnrelatedModuleConflict.test");
        doTest(fileName);
    }

    @TestMetadata("visibilityConflictInImport/visibilityConflictInImport.test")
    public void testVisibilityConflictInImport_VisibilityConflictInImport() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/moveMultiModule/visibilityConflictInImport/visibilityConflictInImport.test");
        doTest(fileName);
    }
}
