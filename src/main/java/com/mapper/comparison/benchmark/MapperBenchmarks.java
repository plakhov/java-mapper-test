package com.mapper.comparison.benchmark;


import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class MapperBenchmarks {


    @Benchmark
    @BenchmarkMode(Mode.All)
    public void mapStructToSimpleRecordBenchmark(ExecutionPlan plan){
        plan.mapStructConverter.toRecord(plan.simpleEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void mapStructToSimpleEntityBenchmark(ExecutionPlan plan){
        plan.mapStructConverter.toEntity(plan.simpleRecord);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void mapStructToComplexRecordBenchmark(ExecutionPlan plan){
        plan.mapStructConverter.toRecord(plan.complexEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void mapStructToComplexEntityBenchmark(ExecutionPlan plan){
        plan.mapStructConverter.toEntity(plan.complexRecord);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void jmapperToSimpleRecordBenchmark(ExecutionPlan plan){
        plan.jmapperConverter.toRecord(plan.simpleEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void jmapperToSimpleEntityBenchmark(ExecutionPlan plan){
        plan.jmapperConverter.toEntity(plan.simpleRecord);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void jmapperToComplexRecordBenchmark(ExecutionPlan plan){
        plan.jmapperConverter.toRecord(plan.complexEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void jmapperToComplexEntityBenchmark(ExecutionPlan plan){
        plan.jmapperConverter.toEntity(plan.complexRecord);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void dozerToSimpleRecordBenchmark(ExecutionPlan plan){
        plan.dozerConverter.toRecord(plan.simpleEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void dozerToSimpleEntityBenchmark(ExecutionPlan plan){
        plan.dozerConverter.toEntity(plan.simpleRecord);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void dozerToComplexRecordBenchmark(ExecutionPlan plan){
        plan.dozerConverter.toRecord(plan.complexEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void dozerToComplexEntityBenchmark(ExecutionPlan plan){
        plan.dozerConverter.toEntity(plan.complexRecord);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void modelMapperToSimpleRecordBenchmark(ExecutionPlan plan){
        plan.modelMapperConverter.toRecord(plan.simpleEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void modelMapperToSimpleEntityBenchmark(ExecutionPlan plan){
        plan.modelMapperConverter.toEntity(plan.simpleRecord);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void modelMapperToComplexRecordBenchmark(ExecutionPlan plan){
        plan.modelMapperConverter.toRecord(plan.complexEntity);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void modelMapperToComplexEntityBenchmark(ExecutionPlan plan){
        plan.modelMapperConverter.toEntity(plan.complexRecord);
    }

}
