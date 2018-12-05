1. Name the steps of JPEG encoding and what kinds of math are used in each:
DCT (Discrete Cosine Transformation)
Quantization
    -truncate the data
    -e.g. 101101 = 45 (6 bits).
    Truncate to 4 bits: 1011 = 11.
    Truncate to 3 bits: 101 = 5
Zigzag Scan
    -map a square matrix to a 1xn array
    -set it up for huffman coding
DPCM on DC component
    -no clue how this works
RLE on AC Components
    -1x64 vector has lots of zeros in it
    Encode as (skip, value) pairs, where skip is the number of zeros and value is the next non-zero component.
    Send (0,0) as end-of-block sentinel value.
Entropy Coding
    -Us huffman codon to assign custom values to the different characters


2. How does Huffman Coding play a role in creating the final JPEG bit stream?
I is used in the entropy coding to reduce the bit size of the 1xn array