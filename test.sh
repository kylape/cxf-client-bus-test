#!/bin/bash

i=0
while [ $i -lt 30 ]; do 
  curl -i http://localhost:8080/cxfClientBusTest/client?shared & 
  let i=$i+1 
done
