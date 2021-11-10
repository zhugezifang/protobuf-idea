package com.vince.xq;


import com.google.protobuf.InvalidProtocolBufferException;
import com.googlecode.protobuf.format.JsonFormat;
import com.vince.schema.StudentSchema.Student;

public class MainTest {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        Student.Builder builder = Student.newBuilder();
        builder.setId(1);
        builder.setName("段小秋");
        builder.setEmail("31346337@qq.com");
        //序列化
        Student stu = builder.build();
        System.out.println(stu);

        byte[] data = stu.toByteArray();
        Student student = Student.parseFrom(data);
        System.out.println(student);


        System.out.println(JsonFormat.printToString(builder.build()));


    }
}
