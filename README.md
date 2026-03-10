```
     ██╗███████╗██╗   ██╗
     ██║██╔════╝██║   ██║
     ██║███████╗██║   ██║
██   ██║╚════██║╚██╗ ██╔╝
╚█████╔╝███████║ ╚████╔╝ 
 ╚════╝ ╚══════╝  ╚═══╝  
```

> **Java Structured Values** — The pandas of the JVM.
                              

---

## 📖 What is JSV?

**JSV** (Java Structured Values) is  a Java Clone of pandas in python , than can handles .csv operations with visualisation support

If you've ever wished you could do this in Java...

```python
# Python / pandas
df = pd.read_csv("data.csv")
df[df["age"] > 30].groupby("city").mean()
```

...now you can give it a try in java : 

```java
// Java / JSV
DataFrame df = JSV.readCsv("data.csv");
...comming soon
```

---

## ✨ Features

| Feature | Description |
|---|---|
| 📂 **I/O** | Read & write CSV, JSON, Excel, Parquet |
| 🔧 **Transform** | Filter, map, sort, rename, drop, fill nulls |
| ✨  **Smart Clean** | Clean non desired values the smart way |
| 📊 **Aggregation** | GroupBy, sum, mean, count, min, max |
| 📈 **Stats** | Descriptive statistics out of the box |
| 🛡️ **Type-safe** | Strongly typed columns with generics support |

---
## 📚 Documentation

Full documentation is available at: `https://jsv.io/docs` (...comming soon)

---

## 🏗️ Project Structure

```
jsv/
├── jsv-core/          # Core DataFrame & Series API
├── jsv-io/            # I/O connectors (CSV, JSON, Parquet...)
├── jsv-stats/         # Statistical functions
├── jsv-viz/           # (Coming soon) Visualization support
├── jsv-clean          # clean values with smart descisions
└── jsv-examples/      # Sample projects & notebooks
```

---


## 📄 License

Distributed under the **MIT License**. See [`LICENSE`](LICENSE) for more information.

---

## 🌟 Acknowledgements

Inspired by the amazing work of the [pandas](https://pandas.pydata.org/) community.  
Built with ❤️ for Java developers who love data.

---
<p align="center">
  <strong>⭐ Star this repo if JSV made your data life easier!</strong>
</p>
