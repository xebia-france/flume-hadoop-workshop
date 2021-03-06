package fr.xebia.techevent.hadoop.job.error;

import fr.xebia.techevent.hadoop.job.AccessLog;
import fr.xebia.techevent.hadoop.job.LogParser;
import fr.xebia.techevent.hadoop.job.error.model.ErrorInfo;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;


public class SearchCodeMapper extends Mapper<LongWritable, Text, ErrorInfo, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        AccessLog al = LogParser.parseAccessLog(value.toString());

        // todo
    }
}
