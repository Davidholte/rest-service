package com.repository;

import com.models.Number;

public class NumberRepository
{
    public Number addTwoNumbers()
    {
        Number nr = new Number();
        nr.First = 1;
        nr.Second = 2;
        nr.Sum += (nr.First + nr.Second);
        return nr;
    }
}
