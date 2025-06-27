use serde_yaml::Value as YamlValue;
use std::env;
use std::fs::read_to_string;
use std::process::exit;

fn main() {
    let args: Vec<String> = env::args().collect();
    if args.len() < 2 {
        eprintln!("y2jconv: usage: {} <input.yaml>", args[0]);
        exit(1);
    }
    let input_path = &args[1];

    let yaml_str = read_to_string(input_path)
        .expect("Failed to read the input file");
    let yaml_value: YamlValue = serde_yaml::from_str(&yaml_str)
        .expect("Failed to parse YAML");
    let json_str = serde_json::to_string_pretty(&yaml_value)
        .expect("Failed to serialize to JSON string");

    println!("{}", json_str);
}
