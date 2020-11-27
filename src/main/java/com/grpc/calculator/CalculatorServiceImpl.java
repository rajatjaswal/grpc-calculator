package com.grpc.calculator;

import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends SimpleCalculationGrpc.SimpleCalculationImplBase {

    @Override
    public void addTwoNumbers(TwoNumbers request, StreamObserver<Answer> responseObserver) {
        int x = request.getNumber1()+request.getNumber2();
        Answer ans = Answer
                .newBuilder()
                .setNumber1(x)
                .build();
        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    @Override
    public void multiplyTwoNumbers(TwoNumbers request, StreamObserver<Answer> responseObserver) {
        int x = request.getNumber1()*request.getNumber2();
        Answer ans = Answer
                .newBuilder()
                .setNumber1(x)
                .build();
        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    @Override
    public void divideTwoNumbers(TwoNumbers request, StreamObserver<Answer> responseObserver) {
        int x = request.getNumber1()/request.getNumber2();
        Answer ans = Answer
                .newBuilder()
                .setNumber1(x)
                .build();
        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    @Override
    public void subtractTwoNumbers(TwoNumbers request, StreamObserver<Answer> responseObserver) {
        int x = request.getNumber1()-request.getNumber2();
        Answer ans = Answer
                .newBuilder()
                .setNumber1(x)
                .build();
        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }
}