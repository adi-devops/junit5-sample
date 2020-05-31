package com.abc.automate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Execution(ExecutionMode.CONCURRENT)
@TestInstance(Lifecycle.PER_CLASS)
public class ParallelTest {


	@ParameterizedTest(name = "data={0}")
	@CsvFileSource(resources = "/Data.csv", numLinesToSkip = 1)
	public void testWithCsv(String data) {

		assertTrue(data.contains("test"));
	}

}
