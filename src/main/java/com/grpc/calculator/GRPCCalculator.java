package com.grpc.calculator;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCCalculator {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(3000)
                .addService(new CalculatorServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}

