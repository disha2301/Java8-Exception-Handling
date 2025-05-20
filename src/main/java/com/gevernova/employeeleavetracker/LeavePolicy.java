package com.gevernova.employeeleavetracker;

@FunctionalInterface
public interface LeavePolicy {
    boolean validate(Leave leave);
}